//
// Created by zhangsong on 18-1-22.
//

#ifndef VIRTUALAPP_UTILS_H
#define VIRTUALAPP_UTILS_H

#include "zString.h"

#define getErr "0"

bool getPathFromFd(int fd, zString & path);
bool is_TED_Enable();
void doFileTrace(const char* path, char* operation);
bool isEncryptPath(const char *_path);
const char * getMagicPath();
bool closeAllSockets();

#endif //VIRTUALAPP_UTILS_H
