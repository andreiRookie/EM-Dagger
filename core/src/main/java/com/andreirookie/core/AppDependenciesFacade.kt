package com.andreirookie.core

import com.andreirookie.core.di.AppContextProvider
import com.andreirookie.core.di.network.NetworkProvider

interface AppDependenciesFacade : AppContextProvider, NetworkProvider