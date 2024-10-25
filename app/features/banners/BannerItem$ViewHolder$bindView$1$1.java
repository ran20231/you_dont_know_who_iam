package com.forsale.app.features.banners;

import aa.c1;
import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.s;
import com.forsale.adserver.adviews.baseViews.AdViewContainer;
import com.forsale.adserver.view.models.CommercialModel;
import com.forsale.analytics.commercial.CommercialItemDetailsSource;
import com.forsale.analytics.commercial.CommercialPageSource;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.features.banners.BannerItem;
import com.forsale.app.notifications.fcm.FCMTopLevelFunctionsKt;
import com.forsale.app.utils.ContextExtensionsKt;
import g00.l;
import g00.p;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import t9.y0;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BannerItem.kt */
@d(c = "com.forsale.app.features.banners.BannerItem$ViewHolder$bindView$1$1", f = "BannerItem.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BannerItem$ViewHolder$bindView$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23211a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BannerItem.ViewHolder f23212b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BannerItem f23213c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ c1 f23214d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BannerItem.kt */
    @d(c = "com.forsale.app.features.banners.BannerItem$ViewHolder$bindView$1$1$1", f = "BannerItem.kt", l = {57}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.banners.BannerItem$ViewHolder$bindView$1$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f23215a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BannerItem f23216b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c1 f23217c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ BannerItem.ViewHolder f23218d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BannerItem.kt */
        @d(c = "com.forsale.app.features.banners.BannerItem$ViewHolder$bindView$1$1$1$1", f = "BannerItem.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.banners.BannerItem$ViewHolder$bindView$1$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C02541 extends SuspendLambda implements p<Pair<? extends Integer, ? extends String>, a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f23219a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f23220b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ c1 f23221c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ BannerItem f23222d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ BannerItem.ViewHolder f23223e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02541(c1 c1Var, BannerItem bannerItem, BannerItem.ViewHolder viewHolder, a<? super C02541> aVar) {
                super(2, aVar);
                this.f23221c = c1Var;
                this.f23222d = bannerItem;
                this.f23223e = viewHolder;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(Pair<Integer, String> pair, a<? super wz.p> aVar) {
                return ((C02541) create(pair, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final a<wz.p> create(Object obj, a<?> aVar) {
                C02541 c02541 = new C02541(this.f23221c, this.f23222d, this.f23223e, aVar);
                c02541.f23220b = obj;
                return c02541;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Integer num;
                b.f();
                if (this.f23219a == 0) {
                    f.b(obj);
                    final Pair pair = (Pair) this.f23220b;
                    AdViewContainer adViewContainer = this.f23221c.O;
                    if (pair != null) {
                        num = (Integer) pair.c();
                    } else {
                        num = null;
                    }
                    adViewContainer.setVerticalId(num);
                    final c1 c1Var = this.f23221c;
                    AdViewContainer adViewContainer2 = c1Var.O;
                    final BannerItem.ViewHolder viewHolder = this.f23223e;
                    adViewContainer2.setCheckAllOffersClicked(new l<CommercialPageSource, wz.p>() { // from class: com.forsale.app.features.banners.BannerItem.ViewHolder.bindView.1.1.1.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void b(CommercialPageSource commercialPageSource) {
                            androidx.appcompat.app.d l11;
                            ApplicationResourcesRepository applicationResourcesRepository;
                            String str;
                            Context context = c1.this.getRoot().getContext();
                            if (context != null && (l11 = ContextExtensionsKt.l(context)) != null) {
                                BannerItem.ViewHolder viewHolder2 = viewHolder;
                                Pair<Integer, String> pair2 = pair;
                                w wVar = w.f61809a;
                                applicationResourcesRepository = viewHolder2.f23209c;
                                String string = applicationResourcesRepository.getString(y0.I2, new Object[0]);
                                Object[] objArr = new Object[1];
                                com.google.gson.d dVar = new com.google.gson.d();
                                if (pair2 != null) {
                                    str = pair2.d();
                                } else {
                                    str = null;
                                }
                                objArr[0] = dVar.t(new CommercialModel(commercialPageSource, null, str, 2, null));
                                String format = String.format(string, Arrays.copyOf(objArr, 1));
                                o.h(format, "format(...)");
                                FCMTopLevelFunctionsKt.b(l11, Uri.parse(format).toString());
                            }
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ wz.p invoke(CommercialPageSource commercialPageSource) {
                            b(commercialPageSource);
                            return wz.p.f75480a;
                        }
                    });
                    this.f23221c.O.setSourceCategoryFullPath(this.f23222d.w().b());
                    this.f23221c.O.setSource(CommercialItemDetailsSource.SUB_CATEGORIES_SCREEN);
                    this.f23221c.O.setPositionCategoryId(this.f23222d.w().c());
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BannerItem bannerItem, c1 c1Var, BannerItem.ViewHolder viewHolder, a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f23216b = bannerItem;
            this.f23217c = c1Var;
            this.f23218d = viewHolder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(Object obj, a<?> aVar) {
            return new AnonymousClass1(this.f23216b, this.f23217c, this.f23218d, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = b.f();
            int i11 = this.f23215a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                MutableSharedFlow<Pair<Integer, String>> j11 = this.f23216b.w().j();
                C02541 c02541 = new C02541(this.f23217c, this.f23216b, this.f23218d, null);
                this.f23215a = 1;
                if (FlowKt.collectLatest(j11, c02541, this) == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerItem$ViewHolder$bindView$1$1(BannerItem.ViewHolder viewHolder, BannerItem bannerItem, c1 c1Var, a<? super BannerItem$ViewHolder$bindView$1$1> aVar) {
        super(2, aVar);
        this.f23212b = viewHolder;
        this.f23213c = bannerItem;
        this.f23214d = c1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new BannerItem$ViewHolder$bindView$1$1(this.f23212b, this.f23213c, this.f23214d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        s sVar;
        f11 = b.f();
        int i11 = this.f23211a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            sVar = this.f23212b.f23208b;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23213c, this.f23214d, this.f23212b, null);
            this.f23211a = 1;
            if (RepeatOnLifecycleKt.b(sVar, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((BannerItem$ViewHolder$bindView$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
