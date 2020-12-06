package com.mcnz.jenkins
 
class uatInput {

  boolean buildIsUatApproved() {
    flag = false
    file = new File("C:/_tools/approved.txt")
    
    if (file.exists()){
      println "Printing Approval File Contents"
      file.eachLine{line-> println line}
    	flag = true
    }
    else {
      println "Approval file does not exist."
    }
    
    return flag;
    
  }

}
