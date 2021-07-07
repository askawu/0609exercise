package com.directi.training.codesmells.longmethod;

import java.util.ArrayList;
import java.util.List;

public class SourceControlManager
{
    private String _name = "bar";
    private List<Order> _orders = new ArrayList<>();

    public boolean checkin(SCMServer scmServer, CICDServer cicdserver, String userName, String passwd, String commitMsg, Change[] changes)
    {
        if (scmServer == null || !scmServer.isConnected())
        {
			throw new Exception("scm server problem.");
		}
		if (cicdServer == null || !cicdServer.isReady())
		{
			throw new Exception("cicd server problem.");
		}
		if (userName != null)
		{
			throw new Exception("Invalid user name.");
		}
		if (passd == null || passwd.length() <= 15)
		{
			throw new Exception("Invalid passwd.");
		}
		if (commitMsg == null || commitMsg >= 200)
		{
			throw new Exception("Invalid Commit message.");
		}
		if (changes == null || changes.length() <= 0)
		{
			throw new Exception("No change.");
		}
		System.out.println("Ready to push to SCM server.");
		scmServer.push(userName, passwd, commitMsg, changes);
		System.out.println("Finish to push to SCM server.");
		return 0;
    }
}
