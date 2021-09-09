let num = 1;
const empArr = [];

function empClass(empNo, empName) {
    this.empNo = empNo;
    this.empName = empName;
    this.output = () => {
        console.log(`사원번호 : ${this.empNo}, 사원명 : ${this.empName}`);
    };
}

const createEmp = setInterval(() => {
    empArr.push(new empClass(num, `emp${num}`));
    num++;
}, 3000);

printEmp = () => {
    for (let i = 0; i < empArr.length; i++) {
        empArr[i].output();
    }
};