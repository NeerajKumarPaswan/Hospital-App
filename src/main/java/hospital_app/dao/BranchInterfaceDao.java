package hospital_app.dao;

import java.util.List;

import hospital_app.dto.Branch;

public interface BranchInterfaceDao {
	public abstract Branch saveBranch(Branch branch);
	public abstract Branch getBranchById(int id);
	public abstract List<Branch> getAllBranchByHospitalById(int id);
	public abstract Branch updateBranchById(int id ,Branch branch);
	public abstract boolean deleteBranchById(int id);

}
