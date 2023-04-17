package tr.edu.ogu.ceng.service;

import java.sql.Timestamp;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import tr.edu.ogu.ceng.dao.SettingRepository;
import tr.edu.ogu.ceng.dto.SettingDto;
import tr.edu.ogu.ceng.model.Setting;
import tr.edu.ogu.ceng.service.Exception.EntityNotFoundException;

@Service
@AllArgsConstructor
public class SettingService {
<<<<<<< Updated upstream
	@Autowired
	private SettingRepository settingRepository;
	private ModelMapper modelMapper;
=======

	private final SettingRepository settingRepository;
	private final ModelMapper modelMapper;
>>>>>>> Stashed changes

	public SettingDto updateSetting(SettingDto settingDto) {
		Setting setting = modelMapper.map(settingDto, Setting.class);
		setting.setCreateDate(settingRepository.findByKey(setting.getKey()).getCreateDate());
		setting.setUpdateDate(new Timestamp(System.currentTimeMillis()));
		if (!settingRepository.existsById(setting.getId()))
			throw new EntityNotFoundException("Setting not found!");
		return modelMapper.map(settingRepository.save(setting), SettingDto.class);

	}

	public SettingDto getSetting(String key) throws EntityNotFoundException {
		Setting setting = settingRepository.findByKey(key);
		if (setting == null) {
			throw new EntityNotFoundException();
		}
		return modelMapper.map(setting, SettingDto.class);
	}

	public String findValueByKey(String key) {
		Setting setting = settingRepository.findByKey(key);
		if (setting == null) {
			throw new EntityNotFoundException("Setting with " + key + " not found!");
		}
		return setting.getValue();
	}
}