package Encapsulations;

class Account {
    private long accNo;
    String name, email;
    float amount;

    public long getAccNo(){
        return accNo;
    }
    public void setAccNo(long accNo){
        this.accNo=accNo;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public float getAmount(){
        return amount;
    }
    public void setAmount(float amount){
        this.amount=amount;
    }
}
