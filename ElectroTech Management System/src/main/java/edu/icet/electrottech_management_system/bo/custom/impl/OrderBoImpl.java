package edu.icet.electrottech_management_system.bo.custom.impl;

import edu.icet.electrottech_management_system.bo.custom.OrderBo;
import edu.icet.electrottech_management_system.dao.DaoFactory;
import edu.icet.electrottech_management_system.dao.custom.OrderDao;
import edu.icet.electrottech_management_system.dao.util.DaoType;
import edu.icet.electrottech_management_system.dto.OrderDto;

import java.sql.SQLException;
import java.util.List;

public class OrderBoImpl implements OrderBo {
    private OrderDao orderDao= DaoFactory.getInstance().getDao(DaoType.ORDER);
    @Override
    public boolean save(OrderDto dto) throws SQLException, ClassNotFoundException {
        return orderDao.save(dto);
    }

    @Override
    public boolean update(OrderDto dto) throws SQLException, ClassNotFoundException {
        return orderDao.update(dto);
    }

    @Override
    public boolean delete(Long value) throws SQLException, ClassNotFoundException {
        return orderDao.delete(value);
    }

    @Override
    public List<OrderDto> getAll() throws SQLException, ClassNotFoundException {
        return orderDao.getAll();
    }

    @Override
    public Long getNextId() throws SQLException {
        return orderDao.getNextId();
    }
}
