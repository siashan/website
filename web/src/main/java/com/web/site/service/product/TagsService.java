package com.web.site.service.product;

import com.web.site.dao.product.TagsMapper;
import com.web.site.entity.product.Tags;
import com.web.site.entity.product.TagsExample;
import com.web.site.service.BaseService;
import org.springframework.stereotype.Service;

/**
 * <p>
    *  服务实现类
    * </p>
 *
 * @author Small
 * @since 2018-09-29
 */
@Service
public class TagsService extends BaseService<TagsMapper, Tags, TagsExample> {


}