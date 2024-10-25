package com.forsale.app.features.postad.extraattributes.attributeview;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.s;
import com.forsale.app.features.postad.extraattributes.PostAdAttributesFragment;
import com.forsale.app.features.postad.extraattributes.attributeview.AttributeFile;
import dj.e;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AttributeFile.kt */
@d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeFile$ViewHolder$setUpUI$1$7", f = "AttributeFile.kt", l = {116}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AttributeFile$ViewHolder$setUpUI$1$7 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35367a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AttributeFile.ViewHolder f35368b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AttributeFileViewModel f35369c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AttributeFile.kt */
    @d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeFile$ViewHolder$setUpUI$1$7$1", f = "AttributeFile.kt", l = {117}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.extraattributes.attributeview.AttributeFile$ViewHolder$setUpUI$1$7$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35370a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AttributeFileViewModel f35371b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AttributeFile.ViewHolder f35372c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AttributeFile.kt */
        @d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeFile$ViewHolder$setUpUI$1$7$1$1", f = "AttributeFile.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.postad.extraattributes.attributeview.AttributeFile$ViewHolder$setUpUI$1$7$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C04061 extends SuspendLambda implements p<String, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f35373a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f35374b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ AttributeFile.ViewHolder f35375c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C04061(AttributeFile.ViewHolder viewHolder, zz.a<? super C04061> aVar) {
                super(2, aVar);
                this.f35375c = viewHolder;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(String str, zz.a<? super wz.p> aVar) {
                return ((C04061) create(str, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                C04061 c04061 = new C04061(this.f35375c, aVar);
                c04061.f35374b = obj;
                return c04061;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                e i11;
                b.f();
                if (this.f35373a == 0) {
                    f.b(obj);
                    String str = (String) this.f35374b;
                    if ((this.f35375c.j() instanceof PostAdAttributesFragment) && str != null) {
                        i11 = this.f35375c.i();
                        i11.b((Fragment) this.f35375c.j(), str, "Q84SALE_IMAGES");
                    }
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AttributeFileViewModel attributeFileViewModel, AttributeFile.ViewHolder viewHolder, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f35371b = attributeFileViewModel;
            this.f35372c = viewHolder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f35371b, this.f35372c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = b.f();
            int i11 = this.f35370a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                SharedFlow<String> r11 = this.f35371b.r();
                C04061 c04061 = new C04061(this.f35372c, null);
                this.f35370a = 1;
                if (FlowKt.collectLatest(r11, c04061, this) == f11) {
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
    public AttributeFile$ViewHolder$setUpUI$1$7(AttributeFile.ViewHolder viewHolder, AttributeFileViewModel attributeFileViewModel, zz.a<? super AttributeFile$ViewHolder$setUpUI$1$7> aVar) {
        super(2, aVar);
        this.f35368b = viewHolder;
        this.f35369c = attributeFileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AttributeFile$ViewHolder$setUpUI$1$7(this.f35368b, this.f35369c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f35367a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            s j11 = this.f35368b.j();
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35369c, this.f35368b, null);
            this.f35367a = 1;
            if (RepeatOnLifecycleKt.b(j11, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AttributeFile$ViewHolder$setUpUI$1$7) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
