package com.forsale.app.features.maincontainer;

import androidx.lifecycle.b0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.analytics.PLFSource;
import kotlin.jvm.internal.o;
/* compiled from: MainContainerSharedViewModel.kt */
/* loaded from: classes2.dex */
public final class MainContainerSharedViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final wz.h f31448k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerSharedViewModel(BaseRepository baseRepository) {
        super(baseRepository);
        wz.h a11;
        o.i(baseRepository, "baseRepository");
        a11 = kotlin.d.a(new g00.a<b0<PLFSource>>() { // from class: com.forsale.app.features.maincontainer.MainContainerSharedViewModel$plfSource$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final b0<PLFSource> invoke() {
                return new b0<>();
            }
        });
        this.f31448k0 = a11;
    }
}
