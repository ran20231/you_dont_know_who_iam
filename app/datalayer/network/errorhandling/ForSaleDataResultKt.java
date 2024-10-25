package com.forsale.app.datalayer.network.errorhandling;

import com.forsale.app.datalayer.network.errorhandling.ForSaleDataResult;
import g00.a;
import g00.l;
import java.io.IOException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: ForSaleDataResult.kt */
/* loaded from: classes2.dex */
public final class ForSaleDataResultKt {
    public static final <T> void fold(ForSaleDataResult<? extends T> forSaleDataResult, l<? super T, p> onSuccess, l<? super ForSaleDataResult.Error, p> onError) {
        o.i(forSaleDataResult, "<this>");
        o.i(onSuccess, "onSuccess");
        o.i(onError, "onError");
        if (forSaleDataResult instanceof ForSaleDataResult.Success) {
            onSuccess.invoke((Object) ((ForSaleDataResult.Success) forSaleDataResult).getData());
        } else if (forSaleDataResult instanceof ForSaleDataResult.Error) {
            onError.invoke(forSaleDataResult);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final <T> T getOrElse(ForSaleDataResult<? extends T> forSaleDataResult, T t11) {
        o.i(forSaleDataResult, "<this>");
        if (forSaleDataResult instanceof ForSaleDataResult.Success) {
            return (T) ((ForSaleDataResult.Success) forSaleDataResult).getData();
        }
        return t11;
    }

    public static final <T> T getOrNull(ForSaleDataResult<? extends T> forSaleDataResult) {
        o.i(forSaleDataResult, "<this>");
        if (forSaleDataResult instanceof ForSaleDataResult.Success) {
            return (T) ((ForSaleDataResult.Success) forSaleDataResult).getData();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> ForSaleDataResult<R> mapSuccess(ForSaleDataResult<? extends T> forSaleDataResult, l<? super T, ? extends R> transform) {
        o.i(forSaleDataResult, "<this>");
        o.i(transform, "transform");
        if (forSaleDataResult instanceof ForSaleDataResult.Success) {
            return ForSaleDataResult.Companion.success(transform.invoke((Object) ((ForSaleDataResult.Success) forSaleDataResult).getData()));
        }
        return forSaleDataResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> ForSaleDataResult<T> onComplete(ForSaleDataResult<? extends T> forSaleDataResult, a<p> action) {
        o.i(forSaleDataResult, "<this>");
        o.i(action, "action");
        action.invoke();
        return forSaleDataResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> ForSaleDataResult<T> onInternetConnectionError(ForSaleDataResult<? extends T> forSaleDataResult, a<p> onInternetConnectionError) {
        o.i(forSaleDataResult, "<this>");
        o.i(onInternetConnectionError, "onInternetConnectionError");
        if (forSaleDataResult instanceof ForSaleDataResult.Error.InternetConnectionError) {
            onInternetConnectionError.invoke();
        }
        return forSaleDataResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> ForSaleDataResult<T> onRequestError(ForSaleDataResult<? extends T> forSaleDataResult, l<? super ForSaleDataResult.Error, p> onError) {
        boolean z11;
        o.i(forSaleDataResult, "<this>");
        o.i(onError, "onError");
        boolean z12 = true;
        if (forSaleDataResult instanceof ForSaleDataResult.Error.ServerError) {
            z11 = true;
        } else {
            z11 = forSaleDataResult instanceof ForSaleDataResult.Error.ApiError;
        }
        if (!z11) {
            z12 = forSaleDataResult instanceof ForSaleDataResult.Error.EmptyResponseError;
        }
        if (z12) {
            onError.invoke((ForSaleDataResult.Error) forSaleDataResult);
        }
        return forSaleDataResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> ForSaleDataResult<T> onSuccess(ForSaleDataResult<? extends T> forSaleDataResult, l<? super T, p> onSuccess) {
        o.i(forSaleDataResult, "<this>");
        o.i(onSuccess, "onSuccess");
        if (forSaleDataResult instanceof ForSaleDataResult.Success) {
            onSuccess.invoke((Object) ((ForSaleDataResult.Success) forSaleDataResult).getData());
        }
        return forSaleDataResult;
    }

    public static final <R> ForSaleDataResult<R> runAsForSaleDataResult(a<? extends R> block) {
        o.i(block, "block");
        try {
            return ForSaleDataResult.Companion.success(block.invoke());
        } catch (IOException unused) {
            return ForSaleDataResult.Companion.internetError();
        } catch (Exception e11) {
            return ForSaleDataResult.Companion.generalError(e11.getMessage());
        }
    }
}
