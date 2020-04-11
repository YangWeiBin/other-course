//任务5//
// 实现gcd函数，用欧几里得法求两个参数的最大公约数 这一算法基于下面的观察，
// 如果r是a和b的余数，那么a和b的公约数正好也是b和r的公约数，因此我们可以借助等式
// gcd(a,b) = gcd(b,r)
// 把一个gcd的计算问题连续的归约到越来越小的整数对的gcd的计算问题。例如
// gdc(206,40) = gcd(40,6)= gcd(6,4) = gcd(4,2) = gcd(2,0) = 2
// 可以证明，从任意两个正整数开始，反复执行这种归约，最终会产生一对数，其中的第二个是0，
// 此时最大公约数就是另一个数。
// 这个算法被称为欧几里得算法

function gcd(num1, num2){
    if(num2 === 0) return num1;
    return gcd(num2,num1%num2);
}