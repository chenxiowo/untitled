package oopDay01;

public class Company {
    String id;
    String name;
    Member[] memberslist;//公司里的员工数值，需要注意运行过程中
//    需要初期化员工数组
    int index;//添加员工下标


    public Company(){
        memberslist=new Member[5];

    }

    public Company(String _id,String _name){
        id=_id;
        name=_name;
        memberslist=new Member[5];
    }
//    添加员工
    public boolean addMember(Member member){
        if(index<memberslist.length){
            memberslist[index++]=member;
            return true;
        }else {
//            添加失败
            System.out.println(member.name+"添加失败！！");
            return false;
        }
    }

//    显示公司员工信息
    public void showCompany(){
        System.out.println("公司id："+id);
        System.out.println("公司姓名："+name);
        for (Member member:memberslist){
            if (member==null){
                break;
            }
            member.show();
        }
    }
}
