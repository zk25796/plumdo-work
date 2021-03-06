package com.plumdo.flow.rest.definition;

import java.util.List;

import com.plumdo.flow.rest.AbstractPaginateList;
import com.plumdo.flow.rest.RestResponseFactory;



public class ProcessDefinitionsPaginateList extends AbstractPaginateList {

	protected RestResponseFactory restResponseFactory;

	public ProcessDefinitionsPaginateList(RestResponseFactory restResponseFactory) {
		this.restResponseFactory = restResponseFactory;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected List processList(List list) {
		return restResponseFactory.createProcessDefinitionResponseList(list);
	}
}
