package com.web.site.controller.mobile;

import com.web.site.common.consts.PUBConstants;
import com.web.site.common.controller.BaseController;
import com.web.site.common.spring.Responses;
import com.web.site.entity.member.DeliveryAddress;
import com.web.site.service.member.DeliveryAddressService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/10/29 15:52
 * @Modified By:
 */
@RestController
@RequestMapping("mobile/deliveryAddress")
@Api(value = "移动端收货地址相关api", tags = "移动端会员收货地址相关api")
public class MobileDeliveryAddressController extends BaseController {

    @Autowired
    private DeliveryAddressService deliveryAddressService;

    @ApiOperation(value = "收货地址列表", notes = "会员全部收货地址")
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public Object list() {
        Long userId = (Long) session.getAttribute(PUBConstants.SESSION_CUR_USER);
        List<Map<String, String>> list = deliveryAddressService.selectByUserId(userId);
        return Responses.success(list);
    }

    @ApiOperation(value = "编辑收货地址", notes = "编辑会员收货地址")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "会员地址id", required = true, paramType = "form", dataType = "Long"),
    })

    @RequestMapping(value = "edit", method = RequestMethod.GET)
    public Object edit(Long id) {
        DeliveryAddress deliveryAddress = deliveryAddressService.selectByPrimaryKey(id);
        return Responses.success(deliveryAddress);
    }

    @ApiOperation(value = "保存收货地址", notes = "保存会员收货地址")
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public Object save(@Valid DeliveryAddress deliveryAddress) {
        deliveryAddress.setCreateTime(new Date());
        deliveryAddressService.insertSelective(deliveryAddress);
        return Responses.success();
    }


}
