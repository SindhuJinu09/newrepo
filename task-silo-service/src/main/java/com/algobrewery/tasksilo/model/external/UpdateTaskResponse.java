package com.algobrewery.tasksilo.model.external;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Data
public class UpdateTaskResponse extends BaseResponse {
}