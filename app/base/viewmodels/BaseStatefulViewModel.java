package com.forsale.app.base.viewmodels;

import androidx.lifecycle.b0;
import com.forsale.app.base.ViewStates;
import com.forsale.app.datalayer.repositories.BaseRepository;
import g00.a;
import kotlin.d;
import kotlin.jvm.internal.o;
import wz.h;
/* compiled from: BaseStatefulViewModel.kt */
/* loaded from: classes2.dex */
public class BaseStatefulViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final h f22218k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseStatefulViewModel(BaseRepository baseRepository) {
        super(baseRepository);
        h a11;
        o.i(baseRepository, "baseRepository");
        a11 = d.a(new a<b0<ViewStates>>() { // from class: com.forsale.app.base.viewmodels.BaseStatefulViewModel$statesLiveData$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final b0<ViewStates> invoke() {
                return new b0<>();
            }
        });
        this.f22218k0 = a11;
    }

    public final b0<ViewStates> v0() {
        return (b0) this.f22218k0.getValue();
    }
}
