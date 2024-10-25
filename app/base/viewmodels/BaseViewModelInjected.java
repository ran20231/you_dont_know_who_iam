package com.forsale.app.base.viewmodels;

import com.forsale.app.datalayer.repositories.BaseRepository;
import kotlin.jvm.internal.o;
/* compiled from: BaseViewModelInjected.kt */
/* loaded from: classes2.dex */
public final class BaseViewModelInjected extends BaseViewModel {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModelInjected(BaseRepository baseRepository) {
        super(baseRepository);
        o.i(baseRepository, "baseRepository");
    }
}
