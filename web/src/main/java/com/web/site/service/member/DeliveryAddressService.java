package com.web.site.service.member;

import com.web.site.service.BaseService;
import com.web.site.entity.member.DeliveryAddressExample;
import java.util.List;
import com.web.site.dao.member.DeliveryAddressMapper;
import com.web.site.entity.member.DeliveryAddress;
import java.util.Map;
import org.springframework.stereotype.Service;

/**
 * <p>
    * 收货地址 服务实现类
    * </p>
 *
 * @author Small
 * @since 2018-10-31
 */
@Service
public class DeliveryAddressService extends BaseService<DeliveryAddressMapper, DeliveryAddress, DeliveryAddressExample> {

	public List<Map<String, String>> selectByUserId(Long userId) {
	    return baseMapper.selectByUserId(userId);
	}


}