package com.forsale.app.features.postad.extraattributes.attributeview;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.s;
import com.forsale.app.features.postad.extraattributes.PostAdAttributesFragment;
import com.forsale.app.features.postad.extraattributes.attributeview.AttributeFile;
import com.forsale.app.utils.ContextExtensionsKt;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import g00.p;
import java.io.File;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: AttributeFile.kt */
@d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeFile$ViewHolder$setUpUI$1$6", f = "AttributeFile.kt", l = {105}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AttributeFile$ViewHolder$setUpUI$1$6 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35358a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AttributeFile.ViewHolder f35359b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AttributeFileViewModel f35360c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AttributeFile.kt */
    @d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeFile$ViewHolder$setUpUI$1$6$1", f = "AttributeFile.kt", l = {FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.extraattributes.attributeview.AttributeFile$ViewHolder$setUpUI$1$6$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35361a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AttributeFileViewModel f35362b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AttributeFile.ViewHolder f35363c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AttributeFile.kt */
        @d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeFile$ViewHolder$setUpUI$1$6$1$1", f = "AttributeFile.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.postad.extraattributes.attributeview.AttributeFile$ViewHolder$setUpUI$1$6$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C04051 extends SuspendLambda implements p<File, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f35364a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f35365b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ AttributeFile.ViewHolder f35366c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C04051(AttributeFile.ViewHolder viewHolder, zz.a<? super C04051> aVar) {
                super(2, aVar);
                this.f35366c = viewHolder;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(File file, zz.a<? super wz.p> aVar) {
                return ((C04051) create(file, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                C04051 c04051 = new C04051(this.f35366c, aVar);
                c04051.f35365b = obj;
                return c04051;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Context context;
                b.f();
                if (this.f35364a == 0) {
                    f.b(obj);
                    File file = (File) this.f35365b;
                    if ((this.f35366c.j() instanceof PostAdAttributesFragment) && file != null && (context = ((PostAdAttributesFragment) this.f35366c.j()).getContext()) != null) {
                        String absolutePath = file.getAbsolutePath();
                        o.h(absolutePath, "getAbsolutePath(...)");
                        ContextExtensionsKt.F(context, absolutePath);
                    }
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AttributeFileViewModel attributeFileViewModel, AttributeFile.ViewHolder viewHolder, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f35362b = attributeFileViewModel;
            this.f35363c = viewHolder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f35362b, this.f35363c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = b.f();
            int i11 = this.f35361a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                SharedFlow<File> p11 = this.f35362b.p();
                C04051 c04051 = new C04051(this.f35363c, null);
                this.f35361a = 1;
                if (FlowKt.collectLatest(p11, c04051, this) == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeFile$ViewHolder$setUpUI$1$6(AttributeFile.ViewHolder viewHolder, AttributeFileViewModel attributeFileViewModel, zz.a<? super AttributeFile$ViewHolder$setUpUI$1$6> aVar) {
        super(2, aVar);
        this.f35359b = viewHolder;
        this.f35360c = attributeFileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AttributeFile$ViewHolder$setUpUI$1$6(this.f35359b, this.f35360c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f35358a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            s j11 = this.f35359b.j();
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35360c, this.f35359b, null);
            this.f35358a = 1;
            if (RepeatOnLifecycleKt.b(j11, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AttributeFile$ViewHolder$setUpUI$1$6) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
