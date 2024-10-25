package com.forsale.app.ui.bottomsheets.postaddistricts;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import com.forsale.app.utils.OneShotEventHandler;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import wz.p;
/* compiled from: PostAdDistrictsViewModel.kt */
/* loaded from: classes3.dex */
public final class PostAdDistrictsViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final int f38995k0;

    /* renamed from: l0  reason: collision with root package name */
    private final DistrictsRepository f38996l0;

    /* renamed from: m0  reason: collision with root package name */
    private final b0<List<DistrictEntity>> f38997m0;

    /* renamed from: n0  reason: collision with root package name */
    private final LiveData<List<DistrictEntity>> f38998n0;

    /* renamed from: o0  reason: collision with root package name */
    private final b0<DistrictEntity> f38999o0;

    /* renamed from: p0  reason: collision with root package name */
    private final OneShotEventHandler<p> f39000p0;

    /* compiled from: PostAdDistrictsViewModel.kt */
    /* loaded from: classes3.dex */
    public interface a {
        PostAdDistrictsViewModel a(int i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdDistrictsViewModel(int i11, DistrictsRepository districtsRepository, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(districtsRepository, "districtsRepository");
        o.i(baseRepository, "baseRepository");
        this.f38995k0 = i11;
        this.f38996l0 = districtsRepository;
        b0<List<DistrictEntity>> b0Var = new b0<>();
        this.f38997m0 = b0Var;
        this.f38998n0 = b0Var;
        this.f38999o0 = new b0<>();
        this.f39000p0 = new OneShotEventHandler<>(null, 0, 3, null);
        B0();
    }

    private final void B0() {
        BuildersKt__Builders_commonKt.launch$default(this, new b(CoroutineExceptionHandler.Key), null, new PostAdDistrictsViewModel$loadDistricts$2(this, null), 2, null);
    }

    public final LiveData<List<DistrictEntity>> A0() {
        return this.f38998n0;
    }

    public final void C0() {
        this.f39000p0.i(p.f75480a);
    }

    public final OneShotEventHandler<p> y0() {
        return this.f39000p0;
    }

    public final b0<DistrictEntity> z0() {
        return this.f38999o0;
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public b(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
        }
    }
}
