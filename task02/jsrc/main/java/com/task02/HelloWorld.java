package com.task02;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.syndicate.deployment.annotations.LambdaUrlConfig;
import com.syndicate.deployment.annotations.lambda.LambdaHandler;
import com.syndicate.deployment.model.lambda.url.AuthType;
import com.syndicate.deployment.model.lambda.url.InvokeMode;
import com.task02.dto.HelloBody;
import com.task02.dto.HelloResponse;

@LambdaHandler(lambdaName = "hello_world",
	roleName = "task02-role",
	isPublishVersion = true
)
@LambdaUrlConfig(
	authType = AuthType.NONE,
	invokeMode = InvokeMode.BUFFERED
)
public class HelloWorld implements RequestHandler<Object, HelloResponse> {

	public HelloResponse handleRequest(Object request, Context context) {
		System.out.println("Hello from lambda");
		return new HelloResponse(200, new HelloBody(200, "Hello from Lambda"));
	}
}
