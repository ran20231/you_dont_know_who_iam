package com.forsale.adserver.view.viewmodel;

import androidx.lifecycle.q0;
import g00.l;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import wz.p;
/* compiled from: BaseViewModel.kt */
/* loaded from: classes2.dex */
public abstract class BaseViewModel extends q0 implements CoroutineScope {

    /* renamed from: a  reason: collision with root package name */
    private final CompletableJob f21648a;

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseViewModel f21649a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.Key key, BaseViewModel baseViewModel) {
            super(key);
            this.f21649a = baseViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            String e11 = this.f21649a.e();
            th2.printStackTrace();
            p pVar = p.f75480a;
            System.out.println((Object) ("Context Name : " + e11 + ": " + pVar));
        }
    }

    public BaseViewModel() {
        CompletableJob Job$default;
        Job$default = JobKt__JobKt.Job$default(null, 1, null);
        this.f21648a = Job$default;
    }

    public abstract String e();

    public final Job f(l<? super zz.a<? super p>, ? extends Object> block) {
        Job launch$default;
        o.i(block, "block");
        launch$default = BuildersKt__Builders_commonKt.launch$default(this, null, null, new BaseViewModel$launchBg$1(block, null), 3, null);
        return launch$default;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return new CoroutineName(e()).plus(new a(CoroutineExceptionHandler.Key, this)).plus(Dispatchers.getMain()).plus(this.f21648a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.q0
    public void onCleared() {
        super.onCleared();
        JobKt__JobKt.cancelChildren$default(getCoroutineContext(), null, 1, null);
    }
}
