package cn.tanziquan.produce.cole.gitdeploy.handler;

import cn.tanziquan.produce.cole.gitdeploy.dto.handler.RequestConext;
import cn.tanziquan.produce.cole.gitdeploy.dto.handler.ResponseDto;
import net.schmizz.sshj.SSHClient;
import net.schmizz.sshj.common.IOUtils;
import net.schmizz.sshj.connection.channel.direct.Session;
import net.schmizz.sshj.xfer.FileSystemFile;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * UploadFileHandler
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
public class UploadFileHandler extends AbstractHandler {
    private static final Logger logger = LoggerFactory.getLogger(UploadFileHandler.class);

    @Override
    public ResponseDto response(RequestConext conext) {
        String codePath = conext.getCodePath();
        SSHClient ssh = new SSHClient();
        try {
            ssh.loadKnownHosts();
            ssh.connect("123.206.57.45");
            ssh.authPassword("root", "prudence520");
            String rmodir="/data/build/" + conext.getBodyDto().getAfter()+"/";
            final Session session = ssh.startSession();
            try {

                final Session.Command cmd = session.exec("mkdir "+rmodir);
                System.out.println(IOUtils.readFully(cmd.getInputStream()).toString());
                System.out.println("\n** exit status: " + cmd.getExitStatus());
            } finally {
                session.close();
            }
            ssh.useCompression();
            final String src = codePath + File.separator + "dist";
            ssh.newSCPFileTransfer().upload(new FileSystemFile(src), rmodir);
            FileUtils.forceDeleteOnExit(new File(codePath));
        } catch (Exception e) {
            logger.error("UploadFileHandler error", e);
        } finally {
            try {
                ssh.disconnect();
            } catch (IOException e) {
                //
            }
        }
        return null;
    }
}
