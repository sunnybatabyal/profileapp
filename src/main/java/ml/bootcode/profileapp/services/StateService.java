/**
 *
 */
package ml.bootcode.profileapp.services;

import java.util.List;

import ml.bootcode.profileapp.dto.StateDTO;
import ml.bootcode.profileapp.models.State;

/**
 * @author sunnybatabyal
 *
 */
public interface StateService {

	List<StateDTO> getStates();

	StateDTO getState(Long id);

	StateDTO addState(StateDTO stateDTO);

	StateDTO updateState(Long id, StateDTO stateDTO);

	void deleteState(Long id);

	StateDTO mapObjectToDto(State state);

	void mapDtoToObject(StateDTO stateDTO, State state);

	State validateState(Long id);
}