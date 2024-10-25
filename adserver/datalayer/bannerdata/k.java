package com.forsale.adserver.datalayer.bannerdata;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: ScreenBanners.kt */
/* loaded from: classes2.dex */
public abstract class k implements v8.b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f20665b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f20666c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final y8.a f20667a;

    /* compiled from: ScreenBanners.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public k(y8.a bannerRepo) {
        o.i(bannerRepo, "bannerRepo");
        this.f20667a = bannerRepo;
    }

    static /* synthetic */ Object c(k kVar, int i11, int i12, zz.a<? super g9.b> aVar) {
        return kVar.f20667a.a(i11, i12, aVar);
    }

    public Object b(int i11, int i12, zz.a<? super g9.b> aVar) {
        return c(this, i11, i12, aVar);
    }

    public final y8.a d() {
        return this.f20667a;
    }
}
