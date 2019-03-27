public String parenBit(String str) {
  if(str.length() == 0)
    return str;
  else if(str.charAt(str.length()-1) == ')')
    return parenBit(str.substring(0,str.length()-1)) + ")";
  else if(str.charAt(str.length()-1) == '(')
    return parenBit(str.substring(0,str.length()-1)) + "(";
  else if(str.indexOf(")") == -1 && str.indexOf("(") != -1)
    return parenBit(str.substring(0,str.length()-1)) + str.charAt(str.length()-1);
  else
    return parenBit(str.substring(0,str.length()-1));
}