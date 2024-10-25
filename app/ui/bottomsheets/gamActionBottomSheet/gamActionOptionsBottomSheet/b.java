package com.forsale.app.ui.bottomsheets.gamActionBottomSheet.gamActionOptionsBottomSheet;

import androidx.lifecycle.b0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.ui.bottomsheets.gamActionBottomSheet.GamActionTypes;
import com.forsale.app.utils.OneShotEventHandler;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: MultipleOptionsViewModel.kt */
/* loaded from: classes3.dex */
public final class b extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final OneShotEventHandler<p> f38118k0;

    /* renamed from: l0  reason: collision with root package name */
    private final b0<Integer> f38119l0;

    /* compiled from: MultipleOptionsViewModel.kt */
    /* loaded from: classes3.dex */
    public interface a {
        b a(GamActionTypes gamActionTypes);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(GamActionTypes type, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(type, "type");
        o.i(baseRepository, "baseRepository");
        this.f38118k0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38119l0 = new b0<>(Integer.valueOf(type.toActionText()));
    }

    public final OneShotEventHandler<p> v0() {
        return this.f38118k0;
    }

    public final b0<Integer> w0() {
        return this.f38119l0;
    }

    public final void x0() {
        OneShotEventHandler.d(this.f38118k0, null, 1, null);
    }
}
