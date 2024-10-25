package com.forsale.app.features.categories.listings.items.dfp.gamGeneric;

import com.forsale.app.datalayer.repositories.GAMRepository;
import com.forsale.app.features.categories.listings.items.dfp.gamGeneric.a;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.o;
import t9.r0;
import wz.p;
/* compiled from: GamGenericViewModel.kt */
/* loaded from: classes2.dex */
public final class b extends qc.b<p> {

    /* renamed from: c  reason: collision with root package name */
    private final a f30686c;

    /* renamed from: d  reason: collision with root package name */
    private final GAMRepository f30687d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a gamType, GAMRepository gamRepository) {
        super(r0.f70132x3, null);
        o.i(gamType, "gamType");
        o.i(gamRepository, "gamRepository");
        this.f30686c = gamType;
        this.f30687d = gamRepository;
    }

    public final a e() {
        return this.f30686c;
    }

    public final AdManagerAdRequest f() {
        a aVar = this.f30686c;
        if (aVar instanceof a.C0335a) {
            return this.f30687d.buildForCategoriesAndDistricts(((a.C0335a) aVar).c(), ((a.C0335a) this.f30686c).d(), ((a.C0335a) this.f30686c).e());
        }
        if (aVar instanceof a.b) {
            return this.f30687d.buildForMidBanner(((a.b) aVar).c(), ((a.b) this.f30686c).d(), ((a.b) this.f30686c).f(), ((a.b) this.f30686c).e(), yb.b.d(((a.b) this.f30686c).g()));
        }
        throw new NoWhenBranchMatchedException();
    }
}
