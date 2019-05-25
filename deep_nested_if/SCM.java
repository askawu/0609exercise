package com.directi.training.codesmells.longmethod;

import java.util.ArrayList;
import java.util.List;

public class SourceControlManager
{
    private String _name = "bar";
    private List<Order> _orders = new ArrayList<>();

    public boolean checkin(SCMServer scmServer, CICDServer cicdserver, String userName, String passwd, String commitMsg, Change[] changes)
    {
        if (scmServer != null && scmServer.isConnected())
        {
			return;
		}
        if (cicdServer == null || cicdServer.isReady())
        {
			return;
		}
        if (userName == null)
        {
									
			return;
	    }
        if (passd == null || passwd.length() <= 15)
        {
			return;
	    }
        if (commitMsg == null || commitMsg >= 200)
        {
			return;
		}
        if (changes == null || changes.length() <= 0)
        {
								                    
            return ;
        }
                         
                     
        System.out.println("Ready to push to SCM server.");
        scmServer.push(userName, passwd, commitMsg, changes);
        System.out.println("Finish to push to SCM server.");
        
    }
}
