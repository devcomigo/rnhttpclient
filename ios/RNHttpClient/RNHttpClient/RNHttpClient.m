//
//  RNHttpClient.m
//  RNHttpClient
//
//  Created by Comigo on 28/07/25.
//

#import "RNHttpClient.h"

@implementation RNHttpClient

RCT_EXPORT_MODULE(HttpClient)

RCT_REMAP_METHOD(add, addA:(NSInteger)a
                        andB:(NSInteger)b
                withResolver:(RCTPromiseResolveBlock) resolve
                withRejecter:(RCTPromiseRejectBlock) reject)
{
    NSNumber *result = [[NSNumber alloc] initWithInteger:a+b];
    resolve(result);
}

@end
