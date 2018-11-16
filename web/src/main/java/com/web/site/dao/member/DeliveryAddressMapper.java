package com.web.site.dao.member;

import com.web.site.entity.member.DeliveryAddressExample;
import java.util.List;
import com.web.site.entity.member.DeliveryAddress;
import java.util.Map;
import com.web.site.dao.BaseMapper;

public interface DeliveryAddressMapper extends BaseMapper<DeliveryAddress, DeliveryAddressExample> {

	List<Map<String, String>> selectByUserId(Long userId);


}