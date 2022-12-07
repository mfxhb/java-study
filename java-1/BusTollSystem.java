/*
 * @Author: mfxhb
 * @Date: 2022-12-07 12:47:56
 * @LastEditTime: 2022-12-07 13:04:37
 * @Description: 公交收费系统
 */
public class BusTollSystem {
  public static void main(String[] args) {
    // 1. 计算 多少人上过车, 当天收的总车费 最后一站下了几个人
    double unitprice = 2.3;// 单价
    int person = 0, sumprice = 0, lastPersonNum = 0;
    // 上了一个人
    person += 1;
    lastPersonNum += 1;
    sumprice += 1 * unitprice;
    // +2 -1
    person += 2;
    lastPersonNum += 2;
    lastPersonNum -= 1;
    sumprice += 2 * unitprice;
    System.out.println(sumprice);
    System.out.println(person + "," + sumprice + ',' + lastPersonNum);
    int num = 20;
    num += 20;
    System.out.println(num);
  }
}