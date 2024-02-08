package edu.icet.electrottech_management_system.bo.custom.impl;

import edu.icet.electrottech_management_system.bo.custom.PartBo;
import edu.icet.electrottech_management_system.dao.DaoFactory;
import edu.icet.electrottech_management_system.dao.custom.PartDao;
import edu.icet.electrottech_management_system.dao.util.DaoType;
import edu.icet.electrottech_management_system.dto.PartDto;
import edu.icet.electrottech_management_system.entity.Part;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PartBoImpl implements PartBo {
    private PartDao partDao= DaoFactory.getInstance().getDao(DaoType.PART);
    @Override
    public boolean save(PartDto dto) throws SQLException, ClassNotFoundException {
        Part part=new Part();
        part.setName(dto.getName());
        part.setCategory(dto.getCategory());
        part.setStandardFee(dto.getStandardFee());
        return partDao.save(part);
    }

    @Override
    public boolean update(PartDto dto) throws SQLException, ClassNotFoundException {
        return partDao.update(new Part(
                dto.getPartId(),
                dto.getName(),
                dto.getCategory(),
                dto.getStandardFee()
        ));
    }

    @Override
    public boolean delete(Long value) throws SQLException, ClassNotFoundException {
        return partDao.delete(value);
    }

    @Override
    public List<PartDto> getAll() throws SQLException, ClassNotFoundException {
        List<PartDto> list=new ArrayList<>();
        List<Part> entityLIst=partDao.getAll();

        for (Part part:entityLIst) {
            list.add(new PartDto(
                    part.getPartId(),
                    part.getName(),
                    part.getCategory(),
                    part.getStandardFee()
            ));
        }
        return list;
    }

    @Override
    public Long getNextId() throws SQLException {
        return partDao.getNextId();
    }
}
