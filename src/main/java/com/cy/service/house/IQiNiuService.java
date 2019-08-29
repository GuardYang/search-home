package com.cy.service.house;

import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;

import java.io.File;
import java.io.InputStream;

/**
 * @author a123
 * @title: IQiNiuService
 * @projectName search-home
 * @description: TODO
 * @date 2019/8/2610:41 AM
 */
public interface IQiNiuService {

    Response uploadFile(File file) throws QiniuException;

    Response uploadFile(InputStream inputStream) throws QiniuException;

    Response delete(String key) throws QiniuException;
}
