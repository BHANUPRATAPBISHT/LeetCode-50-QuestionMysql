class Solution {
    List<String> list= new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        String[] str={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int n=digits.length();
        pri(n,0,digits,new StringBuilder(),str);
        return list;
        
    }
    
    public void pri(int n,int idx,String digits,StringBuilder s,String[] str)
    {

        if(n==0)
        {
            list.add(s.toString());
            return;
        }
        for(int i=0;i<str[digits.charAt(idx)- '2'].length();i++)
        {
            String a=str[digits.charAt(idx)- '2'];
            s.append(a.charAt(i));
            pri(n-1,idx+1,digits,s,str);
            s.deleteCharAt(s.length()-1);
        }
    }
}