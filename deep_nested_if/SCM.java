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
			System.out.println("No change.");
            return 1;
            if (cicdServer == null || !cicdServer.isReady())
            {
				System.out.println("Invalid Commit message.");
                return 2;
                if (userName == null)
                {
					system.out.println("Invalid passwd.");
                    return 3;
                    if (passd == null || passwd.length() <= 15)
                    {
						system.out.println("Invalid user name.");
						return 4;
                        if (commitMsg == null || commitMsg >= 200)
                        {
							system.out.println("cicd server problem.");
							return 5;
                            if (changes == null || changes.length() <= 0)
                            {
								system.out.println("scm server problem.");
								return 6;
                             
                            } 
							else
							{
                                System.out.println("Ready to push to SCM server.");
								scmServer.push(userName, passwd, commitMsg, changes);
								System.out.println("Finish to push to SCM server.");
								return 0;
                            }
                        } 
                    } 
                } 
            } 
        }
    }
}
