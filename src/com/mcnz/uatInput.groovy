package com.mcnz

public class uatInput {

  def buildIsUatApproved() {
    def file = new File("/tmp/release.version1")
    
    if (file.exists()){
      return true;
    }
    else {
      println "Approval file does not exist."
    }
    
    return false;
  }

}
