package Services;

import java.util.List;

import entity.Invoice;
import entity.InvoiceShop;

public interface InvoiceShopServices {
	void updateInvoiceProfile(String name, String email, String phone, String deliveryAddress, int maHD);

	void updateInvoice(int maHD, int status);

	void insertInvoiceShop(int accountID, int sellID, double tongGia, String email, String name, String phone,
			String deliveryAddress, int orderID);

	void deleteInvoiceShopByAccountId(String id);

	List<InvoiceShop> searchByNgayXuatBySellID(String ngayXuat, int sellID);

	double sumAllInvoiceBySellID(int sellID);

	double totalMoneyMonth(int month, int sellID);

	double totalMoneyDayBySellID(int day, int sellID);

	List<InvoiceShop> getAllInvoiceShop();

	List<InvoiceShop> getInvoiceShopByAccountID(int id);

	InvoiceShop getInvoiceShopBymaHD(int maHD);

	List<InvoiceShop> getRequestInvoiceShop(int status, int sellID);

	List<InvoiceShop> getAllInvoiceShopBySellID(int sellID);

	List<InvoiceShop> getListInvoiceShopByOrderID(int orderID);

	public InvoiceShop getLastedInvoice();
}
