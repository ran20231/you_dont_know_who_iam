package com.forsale.app.features.postad.maininfo;

import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.github.mikephil.charting.utils.Utils;
import g00.p;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import t9.y0;
import wz.i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdMainInfoViewModel.kt */
@d(c = "com.forsale.app.features.postad.maininfo.PostAdMainInfoViewModel$onValidation$1", f = "PostAdMainInfoViewModel.kt", l = {134, 141}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdMainInfoViewModel$onValidation$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35894a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdMainInfoViewModel f35895b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f35896c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdMainInfoViewModel$onValidation$1(PostAdMainInfoViewModel postAdMainInfoViewModel, boolean z11, zz.a<? super PostAdMainInfoViewModel$onValidation$1> aVar) {
        super(2, aVar);
        this.f35895b = postAdMainInfoViewModel;
        this.f35896c = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdMainInfoViewModel$onValidation$1(this.f35895b, this.f35896c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        boolean U0;
        Double d11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35894a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            this.f35895b.k1();
            if (this.f35896c) {
                U0 = this.f35895b.U0();
                if (U0) {
                    ListingDetailsEntity n22 = this.f35895b.O0().n2();
                    if (n22 != null) {
                        d11 = n22.getPrice();
                    } else {
                        d11 = null;
                    }
                    if (o.a(d11, Utils.DOUBLE_EPSILON)) {
                        MutableSharedFlow<Pair<Integer, Pair<g00.a<wz.p>, g00.a<wz.p>>>> k02 = this.f35895b.k0();
                        Integer d12 = kotlin.coroutines.jvm.internal.a.d(y0.f70676sc);
                        final PostAdMainInfoViewModel postAdMainInfoViewModel = this.f35895b;
                        Pair<Integer, Pair<g00.a<wz.p>, g00.a<wz.p>>> a11 = i.a(d12, i.a(new g00.a<wz.p>() { // from class: com.forsale.app.features.postad.maininfo.PostAdMainInfoViewModel$onValidation$1.1
                            {
                                super(0);
                            }

                            @Override // g00.a
                            public /* bridge */ /* synthetic */ wz.p invoke() {
                                invoke2();
                                return wz.p.f75480a;
                            }

                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                PostAdMainInfoViewModel.this.d1();
                            }
                        }, new g00.a<wz.p>() { // from class: com.forsale.app.features.postad.maininfo.PostAdMainInfoViewModel$onValidation$1.2
                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                            }

                            @Override // g00.a
                            public /* bridge */ /* synthetic */ wz.p invoke() {
                                invoke2();
                                return wz.p.f75480a;
                            }
                        }));
                        this.f35894a = 1;
                        if (k02.emit(a11, this) == f11) {
                            return f11;
                        }
                    }
                }
                this.f35895b.d1();
            } else {
                MutableSharedFlow<String> j02 = this.f35895b.j0();
                String string = this.f35895b.J().getString(y0.F4, new Object[0]);
                this.f35894a = 2;
                if (j02.emit(string, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdMainInfoViewModel$onValidation$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
