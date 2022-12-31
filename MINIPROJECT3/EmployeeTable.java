package MINIPROJECT3;

public class EmployeeTable {
	public static void main(String args[]) {
		Employee e[] = new Employee[7];
		e[0] = new Employee();
		e[0].employeeId = 1001;
		e[0].employeeName = "Ashish";
		e[0].DesignationCode = "e";
		e[0].Department = "R&D";
		e[0].basic = 20000;
		e[0].hra = 8000;
		e[0].it = 3000;
		
		e[1] = new Employee();
		e[1].employeeId = 1002;
		e[1].employeeName = "Sushma";
		e[1].DesignationCode = "c";
		e[1].Department = "PM";
		e[1].basic = 30000;
		e[1].hra = 12000;
		e[1].it = 9000;
		
		e[2] = new Employee();
		e[2].employeeId = 1003;
		e[2].employeeName = "Rahul";
		e[2].DesignationCode = "k";
		e[2].Department = "Acct";
		e[2].basic = 10000;
		e[2].hra = 8000;
		e[2].it = 1000;
		
		e[3] = new Employee();
		e[3].employeeId = 1004;
		e[3].employeeName = "Chahat";
		e[3].DesignationCode = "r";
		e[3].Department = "Front Desk";
		e[3].basic = 12000;
		e[3].hra = 6000;
		e[3].it = 2000;
		
		e[4] = new Employee();
		e[4].employeeId = 1005;
		e[4].employeeName = "Ranjan";
		e[4].DesignationCode = "m";
		e[4].Department = "Engg";
		e[4].basic = 50000;
		e[4].hra = 20000;
		e[4].it = 20000;
		
		e[5] = new Employee();
		e[5].employeeId = 1006;
		e[5].employeeName = "Suman";
		e[5].DesignationCode = "e";
		e[5].Department = "Manufacturing";
		e[5].basic = 23000;
		e[5].hra = 9000;
		e[5].it = 4400;
		
		e[6] = new Employee();
		e[6].employeeId = 1007;
		e[6].employeeName = "Tanmay";
		e[6].DesignationCode = "c";
		e[6].Department = "PM";
		e[6].basic = 29000;
		e[6].hra = 12000;
		e[6].it = 10000;
		
		DA d[] = new DA[5];
		
		d[0] = new DA();
		d[0].designationCode = "e";
		d[0].designation = "Engineer";
		d[0].da = 20000;
		
		d[1] = new DA();
		d[1].designationCode = "c";
		d[1].designation = "Consultant";
		d[1].da = 32000;
		
		d[2] = new DA();
		d[2].designationCode = "k";
		d[2].designation = "Clerk";
		d[2].da = 12000;
		
		d[3] = new DA();
		d[3].designationCode = "r";
		d[3].designation = "Receptionist";
		d[3].da = 15000;
		
		d[4] = new DA();
		d[4].designationCode = "m";
		d[4].designation = "Manager";
		d[4].da = 40000;
		
		String n = args[0];
		int empId = Integer.parseInt(n);
		String s = "";
		int i;
		for(i=0;i<e.length;i++) {
			if(e[i].employeeId == empId) {
				s = e[i].DesignationCode;
				break;
			}
		}
		if(i == e.length) {
			System.out.println("There is no Employee with EmpId : "+args[0]);
		} else {
			int daa = 0;
			
			for(int j=0;j<d.length;j++) {
				if(d[j].designationCode.equals(s)) {
					int sal = d[j].da + e[i].basic + e[i].hra - e[i].it;
					System.out.println("EmpNo\tEmpName\tDepartment\tDesignation\tSalary");
					System.out.println(e[i].employeeId+"\t"+e[i].employeeName+"\t"+e[i].Department+"\t"+d[j].designation+"\t"+sal);
				}
				
			}
		}
		
	}
}
