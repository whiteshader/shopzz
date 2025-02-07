package com.whoiszxl.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.whoiszxl.dto.PurchaseOrderDTO;
import com.whoiszxl.dto.PurchaseSettlementOrderDTO;
import com.whoiszxl.entity.PurchaseSettlementOrder;
import com.whoiszxl.entity.vo.PurchaseSettlementOrderVO;

/**
 * <p>
 * 财务中心的采购结算单表 服务类
 * </p>
 *
 * @author whoiszxl
 * @since 2021-07-21
 */
public interface PurchaseSettlementOrderService extends IService<PurchaseSettlementOrder> {

    /**
     * 根据主键ID查询采购结算单详情
     * @param id 主键ID
     * @return 结算单DTO
     */
    PurchaseSettlementOrderDTO getPurchaseSettlementOrderById(Long id);

    /**
     * 更新采购结算单
     * @param purchaseInboundOrderVO 采购结算单参数
     * @return
     */
    Boolean updateSettlementOrder(PurchaseSettlementOrderVO purchaseInboundOrderVO);

    /**
     * 审核采购结算单
     * @param id 采购结算单ID
     * @param status 审核状态
     */
    void approve(Long id, Integer status);

    /**
     * 通过主键id更新采购结算单状态
     * @param id 采购结算单ID
     * @param status 状态
     */
    void updateStatus(Long id, Integer status);

    /**
     * 将采购结算单信息与条目保存到数据库
     * @param settlementOrderDTO 采购结算单
     */
    void savePurchaseSettlementOrderAndItem(PurchaseSettlementOrderDTO settlementOrderDTO);

    /**
     * 创建采购结算单
     * @param purchaseOrderDTO 采购单DTO
     * @return 是否创建成功
     */
    boolean createPurchaseSettlementOrder(PurchaseOrderDTO purchaseOrderDTO);
}
