package hospital_app.dao;

import hospital_app.dto.Observation;

public interface ObservationInterfaceDao {
	public abstract Observation saveObservation(Observation observation);
	public abstract boolean updateObservation(int id,Observation observation);
	public abstract Observation getById(int id);

}
