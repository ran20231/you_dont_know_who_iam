package com.forsale.app.features.postad.addons.addonitem;

import com.forsale.app.datalayer.network.responses.Addon;
import com.forsale.app.features.postad.addons.addonitem.AddonItem;
import g00.l;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AddonItem.kt */
@d(c = "com.forsale.app.features.postad.addons.addonitem.AddonItem$ViewHolder$bindView$1", f = "AddonItem.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AddonItem$ViewHolder$bindView$1 extends SuspendLambda implements l<a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34421a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AddonItem f34422b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AddonItem.ViewHolder f34423c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddonItem.kt */
    @d(c = "com.forsale.app.features.postad.addons.addonitem.AddonItem$ViewHolder$bindView$1$1", f = "AddonItem.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.addons.addonitem.AddonItem$ViewHolder$bindView$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<Addon, a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f34424a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f34425b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AddonItem.ViewHolder f34426c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AddonItem.ViewHolder viewHolder, a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f34426c = viewHolder;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(Addon addon, a<? super p> aVar) {
            return ((AnonymousClass1) create(addon, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<p> create(Object obj, a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f34426c, aVar);
            anonymousClass1.f34425b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f34424a == 0) {
                f.b(obj);
                Addon addon = (Addon) this.f34425b;
                if (addon != null) {
                    this.f34426c.h(addon);
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddonItem$ViewHolder$bindView$1(AddonItem addonItem, AddonItem.ViewHolder viewHolder, a<? super AddonItem$ViewHolder$bindView$1> aVar) {
        super(1, aVar);
        this.f34422b = addonItem;
        this.f34423c = viewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(a<?> aVar) {
        return new AddonItem$ViewHolder$bindView$1(this.f34422b, this.f34423c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f34421a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<Addon> f12 = this.f34422b.x().f();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f34423c, null);
            this.f34421a = 1;
            if (FlowKt.collectLatest(f12, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(a<? super p> aVar) {
        return ((AddonItem$ViewHolder$bindView$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
