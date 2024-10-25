package com.forsale.app.features.categories.home.homelandingscreen.gam;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.b0;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.repositories.GAMRepository;
import com.forsale.app.utils.LiveDataExtensions;
import com.forsale.app.utils.gam.ContentUrlType;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import fj.a;
import g00.l;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import t9.r0;
import wz.p;
import x9.b;
/* compiled from: GamMPUItemViewModel.kt */
/* loaded from: classes2.dex */
public final class GamMPUItemViewModel implements b<p> {

    /* renamed from: a  reason: collision with root package name */
    private final int f24188a;

    /* renamed from: b  reason: collision with root package name */
    private final g00.p<p, List<? extends Object>, p> f24189b;

    /* renamed from: c  reason: collision with root package name */
    private final b0<GamState> f24190c;

    /* renamed from: d  reason: collision with root package name */
    private final LiveData<GamState> f24191d;

    /* renamed from: e  reason: collision with root package name */
    private final LiveData<Boolean> f24192e;

    /* renamed from: f  reason: collision with root package name */
    private final LiveData<AdManagerAdRequest> f24193f;

    /* JADX WARN: Multi-variable type inference failed */
    public GamMPUItemViewModel(LiveData<CategoryEntity> category, final GAMRepository gamRepository, int i11, g00.p<? super p, ? super List<? extends Object>, p> pVar) {
        o.i(category, "category");
        o.i(gamRepository, "gamRepository");
        this.f24188a = i11;
        this.f24189b = pVar;
        b0<GamState> b0Var = new b0<>(GamState.INTIAL);
        this.f24190c = b0Var;
        this.f24191d = b0Var;
        this.f24192e = LiveDataExtensions.a(category, b0Var, new g00.p<CategoryEntity, GamState, Boolean>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.gam.GamMPUItemViewModel$isVisible$1
            @Override // g00.p
            /* renamed from: b */
            public final Boolean invoke(CategoryEntity categoryEntity, GamState gamState) {
                boolean z11;
                if (categoryEntity != null && gamState != GamState.FAILED) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            }
        });
        this.f24193f = Transformations.b(category, new l<CategoryEntity, AdManagerAdRequest>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.gam.GamMPUItemViewModel$mpuBannerRequest$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // g00.l
            /* renamed from: b */
            public final AdManagerAdRequest invoke(CategoryEntity it2) {
                o.i(it2, "it");
                return GAMRepository.this.buildForCategory(Integer.valueOf(it2.getId()), new a(ContentUrlType.HOME, Integer.valueOf(it2.getId()), it2.getCategoryTreeNames(), it2.getName()));
            }
        });
    }

    public final void a(GamState state) {
        o.i(state, "state");
        this.f24190c.postValue(state);
    }

    public final LiveData<GamState> b() {
        return this.f24191d;
    }

    public final LiveData<AdManagerAdRequest> c() {
        return this.f24193f;
    }

    public final LiveData<Boolean> d() {
        return this.f24192e;
    }

    @Override // x9.b
    public int getViewType() {
        return this.f24188a;
    }

    public /* synthetic */ GamMPUItemViewModel(LiveData liveData, GAMRepository gAMRepository, int i11, g00.p pVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(liveData, gAMRepository, (i12 & 4) != 0 ? r0.f69912g4 : i11, (i12 & 8) != 0 ? null : pVar);
    }
}
