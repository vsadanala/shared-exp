package com.mcnz

public class uatInput {

  def buildIsUatApproved(def name) {
    println name
    def file = new File("C:/_tools/approved.txt")
    
    if (file.exists()){
      println "Printing Approval File Contents"
      file.eachLine{line-> println line}
      return true;
    }
    else {
      println "Approval file does not exist."
    }
    
    return false;
    
  }

}
