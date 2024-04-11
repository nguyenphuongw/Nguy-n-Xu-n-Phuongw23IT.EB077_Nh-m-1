package Thi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Employee_manager em = new Employee_manager();
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		int chon = 0;
		while (check == true) {
			System.out.println(
					"1.them nhan vien lau nam va ghi file\n2.them nhan vien thuc tap va file\n3.them nhan vien moi va ghi file\n4.lay so luong nhan vien lau nam\n5.lay so luong nhan vien moi\n6.lay so luong nhan vien thuc tap\n7.lam rong danh sach nhan vien lau nam\n8.lam rong danh sach nhan vien moi\n9.lam rong danh sach nhan vien thuc tap\n10.hien thi danh sach nhan vien lau nam\n11.hien thi danh sach nhan vien moi\n12.hien thi danh sach nhan vien thuc tap\n13.Thoat");
			chon = sc.nextInt();
			switch (chon) {
			case 1: {
				sc.nextLine();
				System.out.println("nam kinh nghiem: ");
				int namkinhnghiem = sc.nextInt();
				System.out.println("ki nang: ");
				String kinang = sc.nextLine();
				sc.nextLine();
				System.out.println("id: ");
				int id = sc.nextInt();
				System.out.println("ten: ");
				String ten = sc.nextLine();
				sc.nextLine();
				System.out.println("so dien thoai: ");
				int phone = sc.nextInt();
				System.out.println("email: ");
				String email = sc.nextLine();
				sc.nextLine();
				System.out.println("them thanh cong");
				try {
					FileOutputStream input = new FileOutputStream("E:\\java_nângcao\\io_stream\\src\\exp\\text2.txt");

					input.write(namkinhnghiem);
					input.write(kinang.getBytes());
					input.write(id);
					input.write(ten.getBytes());
					input.write(phone);
					input.write(email.getBytes());
					input.toString();
					input.flush();

				} catch (FileNotFoundException e) {
					System.out.println("file not found");
				} catch (IOException e) {
					System.out.println("loi!!!");
				}
				Employee_Experience ex = new Employee_Experience(namkinhnghiem, kinang, id, ten, phone, email);
				em.themdanhsach(ex);
				break;
			}
			case 2: {
				sc.nextLine();
				System.out.println("nganh hoc: ");
				String nganhhoc = sc.nextLine();
				System.out.println("hoc ki dang hoc: ");
				String hocki = sc.nextLine();
				sc.nextLine();
				System.out.println("ten truong: ");
				String tentruong = sc.nextLine();
				System.out.println("id: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("ten: ");
				String ten = sc.nextLine();
				System.out.println("so dien thoai: ");
				int phone = sc.nextInt();
				sc.nextLine();
				System.out.println("email: ");
				String email = sc.nextLine();
				System.out.println("them thanh cong");
				try {
					FileOutputStream input = new FileOutputStream("E:\\java_nângcao\\io_stream\\src\\exp\\text2.txt");

					input.write(nganhhoc.getBytes());
					input.write(hocki.getBytes());
					input.write(tentruong.getBytes());
					input.write(id);
					input.write(ten.getBytes());
					input.write(phone);
					input.write(email.getBytes());
					input.toString();
					input.flush();

				} catch (FileNotFoundException e) {
					System.out.println("file not found");
				} catch (IOException e) {
					System.out.println("loi!!!");
				}
				Employee_Intern ex = new Employee_Intern(nganhhoc, hocki, tentruong, id, ten, phone, email);
				em.themdanhsach1(ex);
				break;
			}
			case 3: {
				sc.nextLine();
				System.out.println("Xep loai: ");
				String xeploai = sc.nextLine();
				System.out.println("ten truong: ");
				String tentruong = sc.nextLine();
				sc.nextLine();
				System.out.println("id: ");
				int id = sc.nextInt();
				System.out.println("ten: ");
				String ten = sc.nextLine();
				sc.nextLine();
				System.out.println("so dien thoai: ");
				int phone = sc.nextInt();
				System.out.println("email: ");
				String email = sc.nextLine();
				sc.nextLine();
				System.out.println("them thanh cong");
				try {
					FileOutputStream input = new FileOutputStream("E:\\java_nângcao\\io_stream\\src\\exp\\text2.txt");

					input.write(xeploai.getBytes());
					input.write(tentruong.getBytes());
					input.write(id);
					input.write(ten.getBytes());
					input.write(phone);
					input.write(email.getBytes());
					input.toString();
					input.flush();

				} catch (FileNotFoundException e) {
					System.out.println("file not found");
				} catch (IOException e) {
					System.out.println("loi!!!");
				}
				Employee_Fresher ex = new Employee_Fresher(xeploai, tentruong, id, ten, phone, email);
				em.themdanhsach2(ex);
				break;
			}
			case 4: {
				System.out.println("so luong nhan vien lau nam: " + em.laysldanhsach());
				break;
			}

			case 5: {
				System.out.println("so luong nhan vien moi: " + em.laysldanhsach2());
				break;
			}
			case 6: {
				System.out.println("so luong nhan vien thuc tap: " + em.laysldanhsach3());
				break;
			}
			case 7:
				em.lamrongdanhsach();
				break;
			case 8:
				em.lamrongdanhsach2();
				break;
			case 9:
				em.lamrongdanhsach3();
				break;
			case 10:
				em.hienthi();
				break;
			case 11:
				em.hienthi2();
				break;
			case 12:
				em.hienthi3();
				break;
			case 13:
				check = false;
				System.out.println("tam biet!!!");
				break;
			}

		}
	}
}
