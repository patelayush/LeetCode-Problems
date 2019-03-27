public String changePi(String str) {
  if(str.length() == 0)
    return "";
  if(str.length() < 2 )
    return str;
  else if(str.length() == 2){
    if(str.matches("pi"))
      return "3.14";
    else
      return str;
  }
  else if(str.charAt(str.length()-1) == 'i' && str.charAt(str.length()-2) == 'p')
    return changePi(str.substring(0,str.length()-2)) + "3.14";
  else 
    return changePi(str.substring(0,str.length()-1)) + str.charAt(str.length()-1);
}