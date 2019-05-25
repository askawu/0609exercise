package com.directi.training.codesmells.longmethod;

import java.util.ArrayList;
import java.util.List;

public class SourceControlManager {

    private final String _name;
    private final List<Order> _orders;

    public SourceControlManager() {
        _name = "bar";
        _orders = new ArrayList<>();
    }

    public boolean checkin(SCMServer scmServer, CICDServer cicdServer, String userName, String passwd, String commitMsg, Change[] changes) {
        if (scmServer == null || !scmServer.isConnected()) {
            throw new RuntimeException("scm server problem.");
        }

        if (cicdServer == null || !cicdServer.isReady()) {
            throw new RuntimeException("cicd server problem.");
        }

        if (userName == null) {
            throw new RuntimeException("Invalid user name.");
        }

        if (passwd == null || passwd.length() <= 15) {
            throw new RuntimeException("Invalid passwd.");
        }

        if (commitMsg == null || commitMsg.length() >= 200) {
            throw new RuntimeException("Invalid Commit message.");
        }

        if (changes != null && changes.length() > 0) {
            System.out.println("Ready to push to SCM server.");
            scmServer.push(userName, passwd, commitMsg, changes);
            System.out.println("Finish to push to SCM server.");
            return true;
        } else {
            System.out.println("No change.");
            return false;
        }
    }
}
