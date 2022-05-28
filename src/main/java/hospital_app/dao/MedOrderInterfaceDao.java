package hospital_app.dao;

import java.util.List;

import hospital_app.dto.Item;
import hospital_app.dto.MedOrder;

public interface MedOrderInterfaceDao {
public abstract MedOrder saveMedOrder(MedOrder medorder);
public abstract double totalBill(List<Item > items);

}
